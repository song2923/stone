package java24.board.model;

import java.util.Date;

public class ModelBoard {
<<<<<<< HEAD
    private String boardnm   = "";     //  ` VARCHAR(40) NOT NULL,
    private Integer UseYN     = null;    //   ` TINYINT(1) NOT NULL DEFAULT '1',
    private String InsertUID = "";     //  ` VARCHAR(40) NULL DEFAULT NULL,
    private Date InsertDT  = null;       //` DATETIME NULL DEFAULT NULL,
    private String UpdateUID = "";     //  ` VARCHAR(40) NULL DEFAULT NULL,
    private Date UpdateDT  = null;     //  ` DATETIME NULL DEFAULT NULL,
=======
    
    private String  boardcd    = "";    //`boardcd` VARCHAR(20) NOT NULL,
    private String  boardnm    = "";    //`boardnm` VARCHAR(40) NOT NULL,
    private Boolean UseYN     = null;    //`UseYN` TINYINT(1) NOT NULL DEFAULT '1',
    private String  InsertUID  = "";    //`InsertUID` VARCHAR(40) NULL DEFAULT NULL,
    private Date    InsertDT     = null;    //`InsertDT` DATETIME NULL DEFAULT NULL,
    private String  UpdateUID  = "";    //`UpdateUID` VARCHAR(40) NULL DEFAULT NULL,
    private Date    UpdateDT     = null;    //`UpdateDT` DATETIME NULL DEFAULT NULL,
    public String getBoardcd() {
        return boardcd;
    }
    public void setBoardcd(String boardcd) {
        this.boardcd = boardcd;
    }
>>>>>>> 2e930254e6bde940991f72dec3d4a4d2551eecc3
    public String getBoardnm() {
        return boardnm;
    }
    public void setBoardnm(String boardnm) {
        this.boardnm = boardnm;
    }
<<<<<<< HEAD
    public Integer getUseYN() {
        return UseYN;
    }
    public void setUseYN(Integer useYN) {
=======
    public Boolean getUseYN() {
        return UseYN;
    }
    public void setUseYN(Boolean useYN) {
>>>>>>> 2e930254e6bde940991f72dec3d4a4d2551eecc3
        UseYN = useYN;
    }
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
    @Override
    public String toString() {
<<<<<<< HEAD
        return "ModelBoard [boardnm=" + boardnm + ", UseYN=" + UseYN
                + ", InsertUID=" + InsertUID + ", InsertDT=" + InsertDT
                + ", UpdateUID=" + UpdateUID + ", UpdateDT=" + UpdateDT + "]";
=======
        return "ModelBoard [boardcd=" + boardcd + ", boardnm=" + boardnm
                + ", UseYN=" + UseYN + ", InsertUID=" + InsertUID
                + ", InsertDT=" + InsertDT + ", UpdateUID=" + UpdateUID
                + ", UpdateDT=" + UpdateDT + "]";
>>>>>>> 2e930254e6bde940991f72dec3d4a4d2551eecc3
    }
    public ModelBoard() {
        super();
    }
<<<<<<< HEAD
    
=======
 
>>>>>>> 2e930254e6bde940991f72dec3d4a4d2551eecc3
    
}
