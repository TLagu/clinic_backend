INSERT INTO roles (uuid, created_by, updated_by, role_name)
VALUES ('d0bcb328-c89d-4cf5-add9-61bab97124f8', 1, 1, 'ROLE_ADMIN'),
       ('160c8130-225a-4f52-8c7c-d1d17e129ac1', 1, 1, 'ROLE_DOCTOR'),
       ('a643c1f1-5438-465d-9388-be8ed0614a21', 1, 1, 'ROLE_SECRETARY'),
       ('b674bab6-e683-4c41-b403-4a25c7a482af', 1, 1, 'ROLE_PATIENT'),
       ('4978675b-59d9-4d34-8556-4b59a7dab21b', 1, 1, 'ROLE_PUBLIC');
INSERT INTO users (uuid, created_by, updated_by, email, password, username)
VALUES ('0f751493-b9b8-4a2f-91b1-6241fce07d2c', 1, 1, 'admin@wp.pl', '$2a$10$PbLiLJZLq/332ZbErwPG/Ok7VWO8ve/UeWS0D3Oo/Qm5mPryLD/uO', 'admin'),
       ('3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76', 1, 1, 'doctor@wp.pl', '$2a$10$7CHFRj6KhAZwDcwMjlS7zec5IxpnlU7jVDiEv/nbCbC39geVifCU.', 'doctor'),
       ('df1d6dfb-9ecf-4923-9557-a240c30f23ec', 1, 1, 'secretary@wp.pl', '$2a$10$hajUA5.9FlLdnod0ivu9l.xiCKMLzz3gkfaGuXINS0HwSFeK3aXHC', 'secretary'),
       ('c94706ea-7e26-4b1f-a8f8-d5bb4f9b3806', 1, 1, 'patient@wp.pl', '$2a$10$fqlkjacmkpi2moS/yREamOjXhzGpzp3kYoME6.480YnCuzbnL0CGO', 'patient');
INSERT INTO user_roles (user_uuid, role_uuid)
VALUES ('0f751493-b9b8-4a2f-91b1-6241fce07d2c', 'd0bcb328-c89d-4cf5-add9-61bab97124f8'),
       ('3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76', '160c8130-225a-4f52-8c7c-d1d17e129ac1'),
       ('df1d6dfb-9ecf-4923-9557-a240c30f23ec', 'a643c1f1-5438-465d-9388-be8ed0614a21'),
       ('c94706ea-7e26-4b1f-a8f8-d5bb4f9b3806', 'b674bab6-e683-4c41-b403-4a25c7a482af');
INSERT INTO company (uuid, created_by, updated_by, full_name, short_name, nip, regon, krs, account_number, province,
                     district, community, locality, street, street_no, flat_no, post_code, post, longitude, latitude)
VALUES ('70d38aec-7631-46bc-af92-438865a1b793', 1, 1, 'full_name', 'short_name', 'nip', 'regon', 'krs',
        'account_number', 'province', 'district', 'community', 'locality', 'street', 'street_no', 'flat_no',
        '00-000', 'post', 1, 1);
INSERT INTO clinics (uuid, created_by, updated_by, company, province, district, community, locality, street, street_no,
                     flat_no, post_code, post, clinic_name, description, longitude, latitude)
VALUES ('45e6da6d-c858-4ee9-a535-e5b4f50b6e54', 1, 1, '70d38aec-7631-46bc-af92-438865a1b793', 'province1', 'district1', 'community1', 'locality1', 'street1',
        'streetNo1', 'flatNo1', '00-001', 'post1', 'name1', 'description1', 1, 1),
       ('f45ef247-e76c-45b5-85ae-163ca4e65316', 1, 1, '70d38aec-7631-46bc-af92-438865a1b793', 'province2', 'district2', 'community2', 'locality2', 'street2',
        'streetNo2', 'flatNo2', '00-002', 'post2', 'name2', 'description2', 1, 1),
       ('c9c138b1-d73b-4528-a628-dcc52d43435d', 1, 1, '70d38aec-7631-46bc-af92-438865a1b793', 'province3', 'district3', 'community3', 'locality3', 'street3',
        'streetNo3', 'flatNo3', '00-003', 'post3', 'name3', 'description3', 1, 1),
       ('587c048e-060c-479c-94a1-8d65ae63b369', 1, 1, '70d38aec-7631-46bc-af92-438865a1b793', 'province4', 'district4', 'community4', 'locality4', 'street4',
        'streetNo4', 'flatNo4', '00-004', 'post4', 'name4', 'description4', 1, 1);
INSERT INTO clinics_emails (uuid, created_by, updated_by, clinic, email, is_primary)
VALUES ('effcbd5c-16b0-44b9-b280-c15993ed987c', 1, 1, '45e6da6d-c858-4ee9-a535-e5b4f50b6e54', 'email11@em.pl', true),
       ('832e8252-32a2-415c-9f1a-c1bde159b87a', 1, 1, '45e6da6d-c858-4ee9-a535-e5b4f50b6e54', 'email12@em.pl', false),
       ('3688f702-92f7-4680-9617-424bf50fbc85', 1, 1, 'f45ef247-e76c-45b5-85ae-163ca4e65316', 'email21@em.pl', true),
       ('a13f2064-1d45-43fb-a34a-f5530300e435', 1, 1, 'f45ef247-e76c-45b5-85ae-163ca4e65316', 'email22@em.pl', false),
       ('a21c663e-f329-4375-98b2-df57251e4cb4', 1, 1, 'c9c138b1-d73b-4528-a628-dcc52d43435d', 'email31@em.pl', true),
       ('860911fa-c753-412a-ae89-c86b7fbd9829', 1, 1, 'c9c138b1-d73b-4528-a628-dcc52d43435d', 'email32@em.pl', false),
       ('b41e9b42-ab3d-40f1-9d44-92e33499cc07', 1, 1, '587c048e-060c-479c-94a1-8d65ae63b369', 'email41@em.pl', true),
       ('20941fb8-cd1c-457f-854f-ceca9c866152', 1, 1, '587c048e-060c-479c-94a1-8d65ae63b369', 'email42@em.pl', false);
INSERT INTO phone_types (uuid, created_by, updated_by, phone_type)
VALUES ('661f25a7-b2f3-4765-9cbd-b54eb15c1830', 1, 1, 'Komórka'),
       ('d25734b0-3b40-41a5-9e94-4de4698c840a', 1, 1, 'Stacjonarny');
INSERT INTO clinics_phones (uuid, created_by, updated_by, clinic, phone_type, phone, is_primary)
VALUES ('c41abfe7-93fb-4557-b802-4f6e5d0ace5c', 1, 1, '45e6da6d-c858-4ee9-a535-e5b4f50b6e54', '661f25a7-b2f3-4765-9cbd-b54eb15c1830', '+48 00 000 000 11', true),
       ('a251107c-922a-4d83-9325-5b45c89099ba', 1, 1, '45e6da6d-c858-4ee9-a535-e5b4f50b6e54', 'd25734b0-3b40-41a5-9e94-4de4698c840a', '+48 00 000 000 12', false),
       ('0b73d612-f34a-41a1-9977-854eb139cc52', 1, 1, 'f45ef247-e76c-45b5-85ae-163ca4e65316', '661f25a7-b2f3-4765-9cbd-b54eb15c1830', '+48 00 000 000 21', true),
       ('c85ba1e3-23c0-4919-9f5e-830284b95664', 1, 1, 'f45ef247-e76c-45b5-85ae-163ca4e65316', 'd25734b0-3b40-41a5-9e94-4de4698c840a', '+48 00 000 000 22', false),
       ('c21705e2-a9d4-4b07-80c1-fb5fc01a09b1', 1, 1, 'c9c138b1-d73b-4528-a628-dcc52d43435d', '661f25a7-b2f3-4765-9cbd-b54eb15c1830', '+48 00 000 000 31', true),
       ('9a8d02c4-07dd-4ee5-836f-18268ed3c1f4', 1, 1, 'c9c138b1-d73b-4528-a628-dcc52d43435d', 'd25734b0-3b40-41a5-9e94-4de4698c840a', '+48 00 000 000 32', false),
       ('11be3528-dfcb-4174-a78a-74bbdf547c5d', 1, 1, '587c048e-060c-479c-94a1-8d65ae63b369', '661f25a7-b2f3-4765-9cbd-b54eb15c1830', '+48 00 000 000 41', true),
       ('68f87caa-2188-44b8-a697-bed126cba8ac', 1, 1, '587c048e-060c-479c-94a1-8d65ae63b369', 'd25734b0-3b40-41a5-9e94-4de4698c840a', '+48 00 000 000 42', false);