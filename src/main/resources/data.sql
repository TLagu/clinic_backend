INSERT INTO roles (name) VALUES ('ROLE_ADMIN'), ('ROLE_DOCTOR'), ('ROLE_SECRETARY'), ('ROLE_PATIENT'), ('ROLE_PUBLIC');
INSERT INTO users (email, password, username)
VALUES
    ('admin@wp.pl', '$2a$10$PbLiLJZLq/332ZbErwPG/Ok7VWO8ve/UeWS0D3Oo/Qm5mPryLD/uO', 'admin'),
    ('doctor@wp.pl', '$2a$10$7CHFRj6KhAZwDcwMjlS7zec5IxpnlU7jVDiEv/nbCbC39geVifCU.', 'doctor'),
    ('secretary@wp.pl', '$2a$10$hajUA5.9FlLdnod0ivu9l.xiCKMLzz3gkfaGuXINS0HwSFeK3aXHC', 'secretary'),
    ('patient@wp.pl', '$2a$10$fqlkjacmkpi2moS/yREamOjXhzGpzp3kYoME6.480YnCuzbnL0CGO', 'patient');
INSERT INTO user_roles (user_id, role_id)
VALUES
    (1, 1),
    (2, 2),
    (3, 3),
    (4, 4);