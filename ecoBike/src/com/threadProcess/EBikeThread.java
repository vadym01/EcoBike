package com.threadProcess;

import com.DAO.EBikeData;

public class EBikeThread implements Runnable {
    EBikeData eBikeData = new EBikeData();
    @Override
    public synchronized void run() {
        eBikeData.getAll();
    }
}
