SQL> connect system/saeed;
Connected.
SQL> desc students;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 ID                                        NOT NULL NUMBER(32)
 NAME                                               VARCHAR2(32)
 FATHER_NAME                                        VARCHAR2(32)
 CITY                                               VARCHAR2(32)
 VILLAGE                                            VARCHAR2(32)
 PARENTS_NUMBER                                     VARCHAR2(32)
 PASSPORT_NUMBER                                    VARCHAR2(32)
 STUDENT_NUMBER                                     VARCHAR2(32)

SQL> desc dormitory;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 WING                                               VARCHAR2(32)
 FLOOR                                              VARCHAR2(32)
 ROOM                                               VARCHAR2(32)
 HISTORY                                            VARCHAR2(32)
 REFERENCE                                          VARCHAR2(32)
 ID                                                 NUMBER(32)

SQL> desc university;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 UNIVERSITY                                         VARCHAR2(32)
 DEPARTMENT                                         VARCHAR2(32)
 CLASSES                                            VARCHAR2(32)
 INSTEAD_AASHA                                      VARCHAR2(32)
 ID                                                 NUMBER(32)
 COLLEGE                                            VARCHAR2(32)

SQL> desc users;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 USERNAME                                  NOT NULL VARCHAR2(32)
 NAME                                               VARCHAR2(32)
 PASSWORD                                           VARCHAR2(32)
 SECURITY_QUESTION                                  VARCHAR2(32)
 ANSWER                                             VARCHAR2(32)
