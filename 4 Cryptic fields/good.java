if (isLocalBranch(entity) && isCustomer(entity)) {
    addBonus();
}

private boolean isLocalBranch(Entity entity) {
    return entity.bt == "LOC";
}

private boolean isCustomer(Entity entity){
    return entity.bp_type == "CT";
}
