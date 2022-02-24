const deleteUser = (id: string) => {
    var query = "DELETE FROM Users"
    var condition = ""
    if (id) {
        condition = ` WHERE id = ${id}`
    }
    else {
        throw new Error("ID of user to delete not specified")
    }

    executeSql(query)
}

const executeSql = (query: string) => {}