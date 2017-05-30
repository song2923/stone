package java24.board.infc;

import java.util.List;

import java24.board.model.ModelArticle;

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
    //int getNextArticle(int articleNo);
    
}
