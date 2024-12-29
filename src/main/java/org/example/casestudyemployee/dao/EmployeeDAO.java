package org.example.casestudyemployee.dao;

import java.sql.Connection;
import java.sql.*;
import java.util.*;

public class EmployeeDAO {
    private Connection conn;
    public EmployeeDAO(Connection connection) {
        this.conn = connection;
    }
}
