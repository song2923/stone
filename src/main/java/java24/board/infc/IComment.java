package java24.board.infc;

import java.sql.ResultSet;
import java.sql.SQLException;

import java24.board.model.ModelComment;


public interface IComment {
    ResultSet SelectAll(ModelComment Cmm) throws SQLException;

    ResultSet SelectLike( ModelComment Cmm) throws SQLException;

    ResultSet SelectEqual( ModelComment Cmm) throws SQLException;

    int getCount(ModelComment Cmm) throws SQLException;

    int getMaxAuthid() throws SQLException;

    int Insert( ModelComment Cmm) throws SQLException;

    int Update( ModelComment whereCmm, ModelComment setCmm) throws SQLException;

    int Delete( ModelAuth auth) throws SQLException;
}
