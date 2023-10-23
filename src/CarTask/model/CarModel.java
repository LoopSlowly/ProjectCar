package CarTask.model;

public enum CarModel {
    OCTAVIA("Octavia"),
    MONDEO("Mondeo"),
    GOLF("GOlf");
    private final String modelName;
    CarModel(String modelName) {
        this.modelName = modelName;
    }
    public String getModelName() {
        return modelName;
    }
}