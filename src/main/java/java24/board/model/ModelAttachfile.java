package java24.board.model;

import java.util.Arrays;
import java.util.Date;

public class ModelAttachfile {
<<<<<<< HEAD
    private String InsertUID = "";        // VARCHAR(40) NULL DEFAULT NULL,
    private Date InsertDT  = null;        //DATETIME NULL DEFAULT NULL,
    private String UpdateUID = "";        // VARCHAR(40) NULL DEFAULT NULL,
    private Date UpdateDT  = null;        //DATETIME NULL DEFAULT NULL,
    private byte[] imageData = null;        // LONGBLOB NULL,
=======
    
    private Integer attachfileno = null; //`attachfileno` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
    private String  filename     = "";   //`filename` VARCHAR(50) NOT NULL,
    private String  filetype     = "";   //`filetype` VARCHAR(30) NULL DEFAULT NULL,
    private Integer filesize     = null; //`filesize` INT(11) NULL DEFAULT NULL,
    private Integer articleno    = null; //`articleno` INT(11) NULL DEFAULT NULL,
    private Boolean UseYN        = null; //`UseYN` TINYINT(1) NULL DEFAULT '1',
    private String  InsertUID    = "";   //`InsertUID` VARCHAR(40) NULL DEFAULT NULL,
    private Date    InsertDT     = null; //`InsertDT` DATETIME NULL DEFAULT NULL,
    private String  UpdateUID    = "";   //`UpdateUID` VARCHAR(40) NULL DEFAULT NULL,
    private Date    UpdateDT     = null; //`UpdateDT` DATETIME NULL DEFAULT NULL,
    private byte[]  imageData    = null; //`imageData` LONGBLOB NULL,
    public Integer getAttachfileno() {
        return attachfileno;
    }
    public void setAttachfileno(Integer attachfileno) {
        this.attachfileno = attachfileno;
    }
    public String getFilename() {
        return filename;
    }
    public void setFilename(String filename) {
        this.filename = filename;
    }
    public String getFiletype() {
        return filetype;
    }
    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }
    public Integer getFilesize() {
        return filesize;
    }
    public void setFilesize(Integer filesize) {
        this.filesize = filesize;
    }
    public Integer getArticleno() {
        return articleno;
    }
    public void setArticleno(Integer articleno) {
        this.articleno = articleno;
    }
    public Boolean getUseYN() {
        return UseYN;
    }
    public void setUseYN(Boolean useYN) {
        UseYN = useYN;
    }
>>>>>>> 2e930254e6bde940991f72dec3d4a4d2551eecc3
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
<<<<<<< HEAD
        return "ModelAttachfile [InsertUID=" + InsertUID + ", InsertDT="
                + InsertDT + ", UpdateUID=" + UpdateUID + ", UpdateDT="
                + UpdateDT + ", imageData=" + Arrays.toString(imageData) + "]";
=======
        return "ModelAttachfile [attachfileno=" + attachfileno + ", filename="
                + filename + ", filetype=" + filetype + ", filesize=" + filesize
                + ", articleno=" + articleno + ", UseYN=" + UseYN
                + ", InsertUID=" + InsertUID + ", InsertDT=" + InsertDT
                + ", UpdateUID=" + UpdateUID + ", UpdateDT=" + UpdateDT
                + ", imageData=" + Arrays.toString(imageData) + "]";
>>>>>>> 2e930254e6bde940991f72dec3d4a4d2551eecc3
    }
    public ModelAttachfile() {
        super();
    }
<<<<<<< HEAD
    
=======
   
>>>>>>> 2e930254e6bde940991f72dec3d4a4d2551eecc3
    
    
}
