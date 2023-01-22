INSERT INTO roles (name) VALUES ('ROLE_ADMIN'), ('ROLE_DOCTOR'), ('ROLE_SECRETARY'), ('ROLE_PATIENT'), ('ROLE_PUBLIC');
INSERT INTO users (email, password, username)
VALUES
    ('admin@wp.pl', '$2a$10$nIkLbkKPesJxIFCFYXmdIeC.YbK31Bp9q6zuSZCApBTofH3wEZ4ae', 'admin'),
    ('doctor@wp.pl', '$2a$10$zsBrZlGBxLPs/80Cs2AlXuec5Lyqrrjn8avuKE25Wc8lVHcC9cld6', 'doctor'),
    ('secretary@wp.pl', '$2a$10$47wsbAMRSfa8IQc4uzzNzu1jIbtgRNpnUJqf.wOQvJQMTX4/v8Hvm', 'secretary'),
    ('patient@wp.pl', '$2a$10$Y8n7Gl3w8cIJNBqL5A4kpuZ3twMtLabRGUmgmQmeoxyyxXkXJGflK', 'patient');
INSERT INTO user_roles (user_id, role_id)
VALUES
    (1, 1),
    (2, 2),
    (3, 3),
    (4, 4);