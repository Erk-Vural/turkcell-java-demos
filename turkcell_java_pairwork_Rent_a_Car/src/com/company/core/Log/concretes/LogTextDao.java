package com.company.core.Log.concretes;

import com.company.core.Log.abstracts.LogDao;

public class LogTextDao implements LogDao {
    @Override
    public void logged() {
        System.out.println("Data logged to Text");
    }
}
