public String getCustomerName(String customerId) {
    String sql = "select * from customer where id = ?";
    try(Connection connection = getConnection();
        PreparedStatement statement = connection.prepareStatement(sql)) {
        statement.setString(1, customerId);
        ResultSet results = statement.executeQuery();
        while (results.next()) {
            return results.getString("name");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return null;
}