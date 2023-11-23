package com.jwt.service;

import com.jwt.model.UserModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<UserModel> store = new ArrayList<>();

    public UserService(){
        store.add(new UserModel("Amrendra","amrendra@gamil.com"));
        store.add(new UserModel("yadav","yadav@gamil.com"));
        store.add(new UserModel("Bahubali","bahubali@gamil.com"));
        store.add(new UserModel("Amr","amr@gamil.com"));
        store.add(new UserModel("Jay","jay@gamil.com"));

    }

    public List<UserModel> getUser(){
        return this.store;
    }
}
