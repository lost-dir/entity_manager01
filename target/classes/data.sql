INSERT INTO `student`(`id_student`, `first_name`, `last_name`) VALUES(null, 'heinz', 'doe');
INSERT INTO `student`(`id_student`, `first_name`, `last_name`) VALUES(null, 'heinrich', 'foo');
INSERT INTO `student`(`id_student`, `first_name`, `last_name`) VALUES(null, 'helmut', 'bar');


INSERT INTO `teacher`(`id_teacher`, `first_name`, `last_name`) VALUES(null, 'wilhelm', 'doe');
INSERT INTO `teacher`(`id_teacher`, `first_name`, `last_name`) VALUES(null, 'helga', 'foo');
INSERT INTO `teacher`(`id_teacher`, `first_name`, `last_name`) VALUES(null, 'heidi', 'bar');

INSERT INTO `signature`(`id_signature`, `name`) VALUES(null, 'math');
INSERT INTO `signature`(`id_signature`, `name`) VALUES(null, 'science');
INSERT INTO `signature`(`id_signature`, `name`) VALUES(null, 'literature');

INSERT INTO `course`(`id_course`, `id_student`, `id_teacher`, `id_signature`) VALUES(null, 1, 1, 1);