package com.example.viewmodelexample;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class MainViewModel extends ViewModel {
    private MutableLiveData<ArrayList<String>> users;
    private ArrayList<String> listOfUsers;

    public LiveData<ArrayList<String>> getUsers(){
        if(users == null){
            listOfUsers = new ArrayList<String>();
            users = new MutableLiveData<ArrayList<String>>();
            loadUsers();
        }
        return users;
    }

    public void loadUsers(){
        //load the data in list
        addUser("Ahmed");
        addUser("Maaz");
        addUser("Sajid");
        addUser("Hameed");
        addUser("Zohaib");
        //set data
        users.setValue(listOfUsers);
    }

    public void addUser(String name){
        listOfUsers.add(name);
    }
}
