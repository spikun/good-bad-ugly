public String getCustomerName(String customerId) {
    String sql = "select * from customer where id = " + customerId;
    try(Connection connection = getConnection();
        PreparedStatement statement = connection.prepareStatement(sql)) {
        ResultSet results = statement.executeQuery();
        while (results.next()) {
            return results.getString("name");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return null;
}