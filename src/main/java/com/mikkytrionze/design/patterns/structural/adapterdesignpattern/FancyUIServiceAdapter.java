package com.mikkytrionze.design.patterns.structural.adapterdesignpattern;

public class FancyUIServiceAdapter implements IMultiRestoApp {

    private final FancyUIService fancyUIService;

    public FancyUIServiceAdapter() {
        this.fancyUIService = new FancyUIService();
    }

    public FancyUIServiceAdapter(FancyUIService fancyUIService) {
        this.fancyUIService = fancyUIService;
    }

    @Override
    public void displayMenu(XmlData xmlData) {
        JsonData jsonData = this.convertXmlToJson(xmlData);
        fancyUIService.renderMenu(jsonData);
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        JsonData jsonData = this.convertXmlToJson(xmlData);
        fancyUIService.renderRecommendations(jsonData);
    }

    private JsonData convertXmlToJson(XmlData xmlData) {
        // Conversion logic from XML to JSON would go here
        System.out.println("Converting XML data to JSON data");
        return new JsonData() {
            // Implementation details
        };
    }

}
