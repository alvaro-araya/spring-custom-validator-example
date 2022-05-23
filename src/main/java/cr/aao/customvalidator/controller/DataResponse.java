package cr.aao.customvalidator.controller;

public class DataResponse {
    private String result;
    private DataInputDTO dataObject;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public DataInputDTO getDataObject() {
        return dataObject;
    }

    public void setDataObject(DataInputDTO dataObject) {
        this.dataObject = dataObject;
    }

    @Override
    public String toString() {
        return "DataResponse{" +
                "result='" + result + '\'' +
                ", dataObject=" + dataObject +
                '}';
    }
}
