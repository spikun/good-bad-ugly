const getSongs = () => {
    const query = "SELECT * FROM Songs"
    return executeSql(query)
}

const executeSql = (query: string) => {}