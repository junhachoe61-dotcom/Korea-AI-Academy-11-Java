package com.korai.study.ch10.TODO.entity;

public enum TodoStatus {
    todo("진행전"), inProgress("진행중"), done("완료");

    private String status;

    TodoStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }


    @Override
    public String toString() {
        return status;
    }
}
