--Alteração 1
ALTER TABLE ALUNOS
ADD COLUMN CURSO LONG NOT NULL;

--Alteração 2
ALTER TABLE ALUNOS
ADD FOREIGN KEY (CURSO) REFERENCES CURSOS (ID_CURSO) ON DELETE CASCADE;