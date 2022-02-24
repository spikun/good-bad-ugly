const getSongs = () => {
    const query = "INSERT INTO Songs VALUES (NEWID(), 'Billie Eilish', 'Bad Guy')"
    return executeSql(query)
}

const executeSql = (query: string) => {}