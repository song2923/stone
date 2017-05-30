package java24.board.infc;

import java.util.List;

import java24.board.model.ModelArticle;
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
}
