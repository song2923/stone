package java24.board.model;

import java.util.Arrays;
import java.util.Date;

public class ModelAttachfile {
    private String InsertUID = "";        // VARCHAR(40) NULL DEFAULT NULL,
    private Date InsertDT  = null;        //DATETIME NULL DEFAULT NULL,
    private String UpdateUID = "";        // VARCHAR(40) NULL DEFAULT NULL,
    private Date UpdateDT  = null;        //DATETIME NULL DEFAULT NULL,
    private byte[] imageData = null;        // LONGBLOB NULL,
    public String getInsertUID() {
        return InsertUID;
    }
    public void setInsertUID(String insertUID) {
        InsertUID = insertUID;
    }
    public Date getInsertDT() {
        return InsertDT;
    }
    public void setInsertDT(Date insertDT) {
        InsertDT = insertDT;
    }
    public String getUpdateUID() {
        return UpdateUID;
    }
    public void setUpdateUID(String updateUID) {
        UpdateUID = updateUID;
    }
    public Date getUpdateDT() {
        return UpdateDT;
    }
    public void setUpdateDT(Date updateDT) {
        UpdateDT = updateDT;
    }
    public byte[] getImageData() {
        return imageData;
    }
    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }
    @Override
    public String toString() {
        return "ModelAttachfile [InsertUID=" + InsertUID + ", InsertDT="
                + InsertDT + ", UpdateUID=" + UpdateUID + ", UpdateDT="
                + UpdateDT + ", imageData=" + Arrays.toString(imageData) + "]";
    }
    public ModelAttachfile() {
        super();
    }
    
    
    
}
