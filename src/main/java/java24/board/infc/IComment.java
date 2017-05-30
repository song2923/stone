package java24.board.infc;

import java.sql.ResultSet;
import java.sql.SQLException;


import java24.board.model.ModelComments;


public interface IComment {
    ResultSet SelectAll(ModelComments cmm) throws SQLException;

    ResultSet SelectLike( ModelComments cmm) throws SQLException;

    ResultSet SelectEqual( ModelComments cmm) throws SQLException;

    int getCount(ModelComments Cmm) throws SQLException;

    int getMaxAuthid() throws SQLException;

    int Insert( ModelComments Cmm) throws SQLException;

    int Update( ModelComments whereCmm, ModelComments setCmm) throws SQLException;

    int Delete( ModelComments Cmm) throws SQLException;
}
