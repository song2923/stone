package java24.board.infc;

import java.util.List;

import java24.board.model.ModelArticle;
<<<<<<< HEAD
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

public interface IBoard {
    String getBoardName(String boardcd);
    ModelBoard getBoardOne(String boardcd);
    List<ModelBoard> getBoardList();
    List<ModelBoard> getBoardListResultMap();
    List<ModelBoard> getBoardCustomMap();
    int insertBoard(ModelBoard mb);
    int updateBoard(ModelBoard wheremb, ModelBoard setmb);
    int deleteBoard(ModelBoard mb);
    int increaseHit();
    List<ModelBoard> getBoardSearch();
    List<ModelBoard> getBoardPaging();
    List<ModelBoard> insertBoardList();
    
    int getArticleTotalRecord();
    ModelArticle getArticleList();
    int getArticle();
    int insertArticle();
    int updateArticle();
    int deleteArticle();
    
    ModelArticle getNextArticle();
    ModelArticle getPrevArticle();
    int getAttachFile( );
    int getAttachFileList();
    int insertAttachFile();
    int deleteAttachFile();
    int getComment();
    int getCommentList();
    
    int insertComment();
    int updateComment();
    int deleteComment();
=======

public interface IBoard {
    
    //String getBoardName(String boardcd);
    //ModelBoard getBoardOne(String boardcd);
    //List<ModelBoard> getBoardList();
    //List<ModelBoard> getBoardListResultMap();
    
    int getArticleTotalRecord(int boardcd);
    
    List<ModelArticle> getArticleList();
    
    ModelArticle getArticle(int articleNo);
    
    int insertArticle(ModelArticle TB_BBS_Article);
    int updateArticle(ModelArticle updateValue, ModelArticle searchValue);
    int deleteArticle(ModelArticle TB_BBS_Article);
    
    int increaseHit(int articleNo);
    int getNextArticle();
    
>>>>>>> 2e930254e6bde940991f72dec3d4a4d2551eecc3
}
