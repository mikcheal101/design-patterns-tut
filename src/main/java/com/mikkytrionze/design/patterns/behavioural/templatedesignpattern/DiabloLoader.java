package com.mikkytrionze.design.patterns.behavioural.templatedesignpattern;

public class DiabloLoader extends BaseGameLoader {

    @Override
    public byte[] loadLocalData() {
        /// Simulate loading data
        System.out.println("Loading local Diablo files...");
        return new byte[10];
    }

    @Override
    public void createObjects(byte[] data) {
        /// Simulate creation of objects.
        System.out.println("Creating needed Diablo objects...");
    }

    @Override
    public void downloadAdditionalFiles() {
        /// Simuldate downloading of files.
        System.out.println("Downloading Diablo sounds and videos...");
    }

    @Override
    public void initializeProfiles() {
        /// Simulate profile loading.
        System.out.println("loading saved Diablo profiles...");
    }
}
