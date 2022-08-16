package com.inputOutputTasks;

import com.inputOutputTasks.model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements CrudRepository<User> {

    private final File file;

    public UserRepository(File file) {
        this.file = file;
    }


    @Override
    public User save(User entity) {
        try (BufferedWriter br = new BufferedWriter(new FileWriter(file, true))) {
            String userStr = entity.getId() + ";" + entity.getName() + ";" + entity.getAge();
            br.newLine();
            br.append(userStr);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return entity;
    }

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] cols = line.split(";");

                int id = Integer.parseInt(cols[0]);
                String name = cols[1];
                int age = Integer.parseInt(cols[2]);

                users.add(new User(id, name, age));
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }

        return users;
    }

    @Override
    public User findById(int id) {
        List<User> all = findAll();

        for (User user : all) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void deleteAll() {
        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
            br.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteById(int id) {
        List<User> all = findAll();

        all.removeIf(user -> user.getId() == id);

        saveAll(all);

    }

    @Override
    public void delete(User entity) {
        List<User> all = findAll();
        all.removeIf(users -> users.equals(entity));

        saveAll(all);
    }

    @Override
    public boolean existsById(int id) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] cols = line.split(";");

                int findId = Integer.parseInt(cols[0]);
                String findName = cols[1];
                int findAge = Integer.parseInt(cols[2]);

                if (findId == id) {
                    return true;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public User update(User entity) throws IllegalArgumentException {
        List<User> all = findAll();

        for (User user : all) {
            if (user.equals(entity)) {
                user = entity;
            }
        }
        return entity;
    }

    public void saveAll(List<User> userList) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (User users : userList) {
                String userStr = users.getId() + ";" + users.getName() + ";" + users.getAge();
                bw.write(userStr);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
