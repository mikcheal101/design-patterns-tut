package com.mikkytrionze.design.patterns.behavioural.templatedesignpattern;

public abstract class BaseGameLoader {

    protected BaseGameLoader() {}

    public void load() {
        byte[] data = this.loadLocalData();
        this.createObjects(data);
        this.downloadAdditionalFiles();
        this.cleanTempFiles();
        this.initializeProfiles();
    }

    public void cleanTempFiles() {
        /// Simulate cleaning filesystem.
        System.out.println("Cleaning temporary files...");
    }

    public abstract byte[] loadLocalData();
    public abstract void createObjects(byte[] data);
    public abstract void downloadAdditionalFiles();
    public abstract void initializeProfiles();

}
