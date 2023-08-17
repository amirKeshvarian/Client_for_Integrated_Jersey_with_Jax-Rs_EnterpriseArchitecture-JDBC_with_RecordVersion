package org.company.gateway;

public interface API {
    String BASE_URL = "http://localhost:8080";
    String SAVE_PERSON = BASE_URL + "/api/person/save.do?name=%s&family=%s&salary=%s";
    String ASYNC_SAVE_PERSON = BASE_URL + "/api/person/asyncSave.do?name=%s&family=%s&salary=%s";
    String CHANGE_PERSON = BASE_URL + "/api/person/change.do?id=%s&name=%s&family=%s&salary=%s&recordversion=%s";
    String REMOVE_PERSON = BASE_URL + "/api/person/remove.do?id=%s&recordversion=%s";
    String FIND_ONE_PERSON = BASE_URL + "/api/person/findOne.do?id=%s";
    String FIND_ALL_PERSON = BASE_URL + "/api/person/findAll.do";
}
