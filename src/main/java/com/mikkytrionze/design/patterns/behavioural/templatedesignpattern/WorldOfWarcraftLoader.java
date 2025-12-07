package com.mikkytrionze.design.patterns.behavioural.templatedesignpattern;

public class WorldOfWarcraftLoader extends BaseGameLoader {

    @Override
    public byte[] loadLocalData() {
        /// Simulate loading data
        System.out.println("Loading local WOW files...");
        return new byte[10];
    }

    @Override
    public void createObjects(byte[] data) {
        /// Simulate creation of objects.
        System.out.println("Creating needed WOW objects...");
    }

    @Override
    public void downloadAdditionalFiles() {
        /// Simuldate downloading of files.
        System.out.println("Downloading WOW sounds and videos...");
    }

    @Override
    public void initializeProfiles() {
        /// Simulate profile loading.
        System.out.println("loading saved WOW profiles...");
    }

    @Override
    public void cleanTempFiles() {
        super.cleanTempFiles();

        // Simulate extra actions of cleaning wow files
        System.out.println("Cleaning WOW temporary files...");
    }
}
