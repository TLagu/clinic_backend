INSERT INTO roles (uuid, created_by, updated_by, role_name)
VALUES ('d0bcb328-c89d-4cf5-add9-61bab97124f8', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', 'ROLE_ADMIN'),
       ('160c8130-225a-4f52-8c7c-d1d17e129ac1', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', 'ROLE_DOCTOR'),
       ('a643c1f1-5438-465d-9388-be8ed0614a21', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', 'ROLE_SECRETARY'),
       ('b674bab6-e683-4c41-b403-4a25c7a482af', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', 'ROLE_PATIENT'),
       ('4978675b-59d9-4d34-8556-4b59a7dab21b', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', 'ROLE_PUBLIC');
INSERT INTO users (uuid, created_by, updated_by, email, password, username)
VALUES ('0f751493-b9b8-4a2f-91b1-6241fce07d2c', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', 'admin@wp.pl',
        '$2a$10$PbLiLJZLq/332ZbErwPG/Ok7VWO8ve/UeWS0D3Oo/Qm5mPryLD/uO', 'admin'),
       ('3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', 'doctor@wp.pl',
        '$2a$10$7CHFRj6KhAZwDcwMjlS7zec5IxpnlU7jVDiEv/nbCbC39geVifCU.', 'doctor'),
       ('df1d6dfb-9ecf-4923-9557-a240c30f23ec', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', 'secretary@wp.pl',
        '$2a$10$hajUA5.9FlLdnod0ivu9l.xiCKMLzz3gkfaGuXINS0HwSFeK3aXHC', 'secretary'),
       ('c94706ea-7e26-4b1f-a8f8-d5bb4f9b3806', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', 'patient@wp.pl',
        '$2a$10$fqlkjacmkpi2moS/yREamOjXhzGpzp3kYoME6.480YnCuzbnL0CGO', 'patient');
INSERT INTO user_roles (user_uuid, role_uuid)
VALUES ('0f751493-b9b8-4a2f-91b1-6241fce07d2c', 'd0bcb328-c89d-4cf5-add9-61bab97124f8'),
       ('3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76', '160c8130-225a-4f52-8c7c-d1d17e129ac1'),
       ('df1d6dfb-9ecf-4923-9557-a240c30f23ec', 'a643c1f1-5438-465d-9388-be8ed0614a21'),
       ('c94706ea-7e26-4b1f-a8f8-d5bb4f9b3806', 'b674bab6-e683-4c41-b403-4a25c7a482af');
INSERT INTO company (uuid, created_by, updated_by, full_name, short_name, nip, regon, krs, account_number, province,
                     district, community, locality, street, street_no, flat_no, post_code, post, longitude, latitude)
VALUES ('70d38aec-7631-46bc-af92-438865a1b793', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', 'Ekskluzywne Centra Zdrowotne', 'Exclusive Clinics', '001-252-01-33',
        '001555404', '2055244211', '55102065754455664412135432', 'Mazowieckie', 'Warszawa', 'Warszawa', 'Warszawa',
        'Zdrowa', '007', '1', '01-007', 'Warszawa', 52, 21);
INSERT INTO company_emails (uuid, created_by, updated_by, company, email, is_primary)
VALUES ('ef4befb8-b2ed-11ed-afa1-0242ac120002', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '70d38aec-7631-46bc-af92-438865a1b793',
        'bok.ecz@exclusive.pl', true),
       ('b4c87868-b2f0-11ed-afa1-0242ac120002', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '70d38aec-7631-46bc-af92-438865a1b793',
        'kontakt.ecz@exclusive.pl', true),
       ('f3fd3abe-b2f0-11ed-afa1-0242ac120002', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '70d38aec-7631-46bc-af92-438865a1b793',
        'biuro.ecz@exclusive.pl', true);
-- INSERT INTO company_phones (uuid, created_by, updated_by, company, phone_type, phone, is_primary)
-- VALUES ('48e7b0c8-b354-11ed-afa1-0242ac120002', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
--         'd0bcb328-c89d-4cf5-add9-61bab97124f8', '70d38aec-7631-46bc-af92-438865a1b793',
--         '0a97c062-b357-11ed-afa1-0242ac120002', '+48 22 022 00 01', true);
INSERT INTO clinics (uuid, created_by, updated_by, company, province, district, community, locality, street, street_no,
                     flat_no, post_code, post, clinic_name, description, longitude, latitude)
VALUES ('45e6da6d-c858-4ee9-a535-e5b4f50b6e54', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '70d38aec-7631-46bc-af92-438865a1b793', 'Lubelskie', 'Zamość', 'Zamość',
        'Zamość', 'Piękna', '12', '/14', '22-400', 'Zamość', 'Zamojskie Centrum Zdrowia', 'General practice, Emergency,
        Clinical Psychiatry & Psychology', 50, 23),
       ('f45ef247-e76c-45b5-85ae-163ca4e65316', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '70d38aec-7631-46bc-af92-438865a1b793', 'Dolnośląskie', 'Wrocław',
        'Wrocław', 'Wrocław', 'Przyjazna', '2', 'lok.1-20', '50-500', 'Wrocław', 'Wrocławskie Centrum Zdrowia',
        'General practice, Emergency, Preventive Medicine, Allergy & Immunology', 51, 17),
       ('c9c138b1-d73b-4528-a628-dcc52d43435d', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '70d38aec-7631-46bc-af92-438865a1b793', 'Pomorskie', 'Gdynia', 'Gdynia',
        'Gdynia', 'Lecznicza', '8', 'A-D', '81-200', 'Gdynia', 'Gdyńskie Centrum Zdrowotne', 'General practice,
        Emergency, Genetics, Nuclear Medicine, Diagnostic Radiology', 54, 18),
       ('587c048e-060c-479c-94a1-8d65ae63b369', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '70d38aec-7631-46bc-af92-438865a1b793', 'Łódzkie',
        'Tomaszów Mazowiecki', 'Tomaszów Mazowiecki', 'Tomaszów Mazowiecki', 'Uzdrowiskowa', '4', '', '97-205',
        'Tomaszów Mazowiecki', 'Tomaszowskie Centrum Zdrowotne', 'General practice, Neurology, Obstetrics and
        Gynecology, Urology, Anesthesiology, Surgery ', 51, 20);
INSERT INTO clinics_emails (uuid, created_by, updated_by, clinic, email, is_primary)
VALUES ('effcbd5c-16b0-44b9-b280-c15993ed987c', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '45e6da6d-c858-4ee9-a535-e5b4f50b6e54',
        'zamojski.hc@exclusive.pl', true),
       ('832e8252-32a2-415c-9f1a-c1bde159b87a', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '45e6da6d-c858-4ee9-a535-e5b4f50b6e54',
        'zamojski.hc.internal@exclusive.pl', false),
       ('3688f702-92f7-4680-9617-424bf50fbc85', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', 'f45ef247-e76c-45b5-85ae-163ca4e65316',
        'wroclaw.hc@exclusive.pl', true),
       ('a13f2064-1d45-43fb-a34a-f5530300e435', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', 'f45ef247-e76c-45b5-85ae-163ca4e65316',
        'wroclaw.hc.internal@exclusive.pl', false),
       ('a21c663e-f329-4375-98b2-df57251e4cb4', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', 'c9c138b1-d73b-4528-a628-dcc52d43435d',
        'gdynia.hc@exclusive.pl', true),
       ('860911fa-c753-412a-ae89-c86b7fbd9829', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', 'c9c138b1-d73b-4528-a628-dcc52d43435d',
        'gdynia.hc.internal@exclusive.pl', false),
       ('b41e9b42-ab3d-40f1-9d44-92e33499cc07', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '587c048e-060c-479c-94a1-8d65ae63b369',
        'tomaszow.maz.hc@exclusive.pl', true),
       ('20941fb8-cd1c-457f-854f-ceca9c866152', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '587c048e-060c-479c-94a1-8d65ae63b369',
        'tomaszow.maz.hc.internal@exclusive.pl', false);
INSERT INTO phone_types (uuid, created_by, updated_by, phone_type)
VALUES ('661f25a7-b2f3-4765-9cbd-b54eb15c1830', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', 'Cellphone'),
       ('d25734b0-3b40-41a5-9e94-4de4698c840a', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', 'Landline');
--        ('0a97c062-b357-11ed-afa1-0242ac120002', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
--         'd0bcb328-c89d-4cf5-add9-61bab97124f8', 'centrala, recepcja');
INSERT INTO clinics_phones (uuid, created_by, updated_by, clinic, phone_type, phone, is_primary)
VALUES ('c41abfe7-93fb-4557-b802-4f6e5d0ace5c', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '45e6da6d-c858-4ee9-a535-e5b4f50b6e54',
        '661f25a7-b2f3-4765-9cbd-b54eb15c1830', '+48 00 000 000 11', true),
       ('a251107c-922a-4d83-9325-5b45c89099ba', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '45e6da6d-c858-4ee9-a535-e5b4f50b6e54',
        'd25734b0-3b40-41a5-9e94-4de4698c840a', '+48 00 000 000 12', false),
       ('0b73d612-f34a-41a1-9977-854eb139cc52', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', 'f45ef247-e76c-45b5-85ae-163ca4e65316',
        '661f25a7-b2f3-4765-9cbd-b54eb15c1830', '+48 00 000 000 21', true),
       ('c85ba1e3-23c0-4919-9f5e-830284b95664', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', 'f45ef247-e76c-45b5-85ae-163ca4e65316',
        'd25734b0-3b40-41a5-9e94-4de4698c840a', '+48 00 000 000 22', false),
       ('c21705e2-a9d4-4b07-80c1-fb5fc01a09b1', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', 'c9c138b1-d73b-4528-a628-dcc52d43435d',
        '661f25a7-b2f3-4765-9cbd-b54eb15c1830', '+48 00 000 000 31', true),
       ('9a8d02c4-07dd-4ee5-836f-18268ed3c1f4', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', 'c9c138b1-d73b-4528-a628-dcc52d43435d',
        'd25734b0-3b40-41a5-9e94-4de4698c840a', '+48 00 000 000 32', false),
       ('11be3528-dfcb-4174-a78a-74bbdf547c5d', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '587c048e-060c-479c-94a1-8d65ae63b369',
        '661f25a7-b2f3-4765-9cbd-b54eb15c1830', '+48 00 000 000 41', true),
       ('68f87caa-2188-44b8-a697-bed126cba8ac', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '587c048e-060c-479c-94a1-8d65ae63b369',
        'd25734b0-3b40-41a5-9e94-4de4698c840a', '+48 00 000 000 42', false);
INSERT INTO users_details (uuid, created_by, updated_by, user_uuid, first_name, second_name, last_name, pesel,
                           id_number, birth_day, nip)
VALUES ('d92bd5fa-7d13-4b6a-92c7-becedcef3956', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '0f751493-b9b8-4a2f-91b1-6241fce07d2c', 'Jan', 'Jerzy', 'Admin',
        '00000000001', 'XXX 000001', '1969-01-01', '7710000001'),
       ('0e71d289-28c5-493e-be7f-222281e0875b', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76', 'Krzysztof', 'Marian',
        'Doktor', '00000000002', 'XXX 000002', '1972-05-02', '7710000002'),
       ('f1b464a4-cf89-4b32-8ec0-a5158378b898', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', 'df1d6dfb-9ecf-4923-9557-a240c30f23ec', 'Janina', 'Marta',
        'Sekretarka', '00000000003', 'XXX 000003', '1982-08-03', '7710000003'),
       ('9c255d7c-5df2-465b-a7e7-147be8f0337b', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', 'c94706ea-7e26-4b1f-a8f8-d5bb4f9b3806', 'Bożydar', 'Honoriusz',
        'Pacjent', '00000000004', 'XXX 000004', '1979-11-04', '7710000004');
INSERT INTO appointments (uuid, created_by, updated_by, patient, doctor, clinic, description, recommendations, sick_leave,
                          prescription, referral)
VALUES ('c50fc149-83de-401d-ba45-15497de8bb20', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', 'c94706ea-7e26-4b1f-a8f8-d5bb4f9b3806',
        '3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76', 'f45ef247-e76c-45b5-85ae-163ca4e65316', 'description1',
        'recommendations1', null, null, null),
       ('a97cd9df-1bd0-44b9-917b-ac58ad9be46b', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', 'c94706ea-7e26-4b1f-a8f8-d5bb4f9b3806',
        '3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76', 'f45ef247-e76c-45b5-85ae-163ca4e65316', 'description2',
        'recommendations2', null, null, null),
       ('7024de11-7efc-4bb4-8655-3103762bbc5a', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', 'c94706ea-7e26-4b1f-a8f8-d5bb4f9b3806',
        '3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76', 'f45ef247-e76c-45b5-85ae-163ca4e65316', 'description3',
        'recommendations3', null, null, null),
       ('aedf0f6d-20be-487d-9725-bf091ff2bf6a', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', 'c94706ea-7e26-4b1f-a8f8-d5bb4f9b3806',
        '3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76', 'f45ef247-e76c-45b5-85ae-163ca4e65316', 'description4',
        'recommendations4', null, null, null),
       ('8b84920a-64ab-49ab-b661-4436f349a244', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', 'c94706ea-7e26-4b1f-a8f8-d5bb4f9b3806',
        '3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76', 'f45ef247-e76c-45b5-85ae-163ca4e65316', 'description5',
        'recommendations5', null, null, null),
       ('b8b3d6a6-da48-4371-8307-f2790b2e1bdc', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', 'c94706ea-7e26-4b1f-a8f8-d5bb4f9b3806',
        '3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76', 'f45ef247-e76c-45b5-85ae-163ca4e65316', 'description6',
        'recommendations6', null, null, null),
       ('225453a0-03e2-4dc4-99b9-49d73daae199', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', 'c94706ea-7e26-4b1f-a8f8-d5bb4f9b3806',
        '3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76', 'f45ef247-e76c-45b5-85ae-163ca4e65316', 'description7',
        'recommendations7', null, null, null);
INSERT INTO doctors_calendars (uuid, created_by, updated_by, user_uuid, start_time, end_time, appointment)
VALUES ('ef40a883-8c00-421d-bf98-8a1f469beaa1', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76',
        DATEADD('DAY', 0, DATEADD('HOUR', 12, DATEADD('MINUTE', 0, CURRENT_DATE))),
        DATEADD('DAY', 0, DATEADD('HOUR', 12, DATEADD('MINUTE', 30, CURRENT_DATE))),
        'c50fc149-83de-401d-ba45-15497de8bb20'),
       ('eb68b85c-9019-4dec-8e81-3d0e23bc64d0', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76',
        DATEADD('DAY', 0, DATEADD('HOUR', 12, DATEADD('MINUTE', 30, CURRENT_DATE))),
        DATEADD('DAY', 0, DATEADD('HOUR', 13, DATEADD('MINUTE', 0, CURRENT_DATE))), null),
       ('968568de-9f01-46d3-a316-3b244a2cfe5c', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76',
        DATEADD('DAY', 0, DATEADD('HOUR', 13, DATEADD('MINUTE', 0, CURRENT_DATE))),
        DATEADD('DAY', 0, DATEADD('HOUR', 13, DATEADD('MINUTE', 30, CURRENT_DATE))),
        'a97cd9df-1bd0-44b9-917b-ac58ad9be46b'),
       ('3adcad2d-cca9-49f4-8046-d2eaf9c3170b', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76',
        DATEADD('DAY', 0, DATEADD('HOUR', 13, DATEADD('MINUTE', 30, CURRENT_DATE))),
        DATEADD('DAY', 0, DATEADD('HOUR', 14, DATEADD('MINUTE', 0, CURRENT_DATE))), null),
       ('618511cc-9836-412b-98b1-f849721f2fe3', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76',
        DATEADD('DAY', 0, DATEADD('HOUR', 14, DATEADD('MINUTE', 0, CURRENT_DATE))),
        DATEADD('DAY', 0, DATEADD('HOUR', 14, DATEADD('MINUTE', 30, CURRENT_DATE))), null),
       ('f50d2e55-ed2c-4fdd-9b5f-c054a072305d', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76',
        DATEADD('DAY', 0, DATEADD('HOUR', 14, DATEADD('MINUTE', 30, CURRENT_DATE))),
        DATEADD('DAY', 0, DATEADD('HOUR', 15, DATEADD('MINUTE', 0, CURRENT_DATE))), null),
       ('38167fa3-5cde-439d-964e-bd6934321078', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76',
        DATEADD('DAY', 0, DATEADD('HOUR', 15, DATEADD('MINUTE', 0, CURRENT_DATE))),
        DATEADD('DAY', 0, DATEADD('HOUR', 15, DATEADD('MINUTE', 30, CURRENT_DATE))),
        '7024de11-7efc-4bb4-8655-3103762bbc5a'),
       ('2230d53a-abcb-4571-be1a-7e37b61a8526', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76',
        DATEADD('DAY', 0, DATEADD('HOUR', 15, DATEADD('MINUTE', 30, CURRENT_DATE))),
        DATEADD('DAY', 0, DATEADD('HOUR', 16, DATEADD('MINUTE', 0, CURRENT_DATE))), null),
       ('ec16fb5b-34ba-4260-a8b5-090856300914', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76',
        DATEADD('DAY', 0, DATEADD('HOUR', 16, DATEADD('MINUTE', 0, CURRENT_DATE))),
        DATEADD('DAY', 0, DATEADD('HOUR', 16, DATEADD('MINUTE', 30, CURRENT_DATE))), null),
       ('34cacdad-ab7e-4f61-85a7-d48beaec8736', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76',
        DATEADD('DAY', 0, DATEADD('HOUR', 16, DATEADD('MINUTE', 30, CURRENT_DATE))),
        DATEADD('DAY', 0, DATEADD('HOUR', 17, DATEADD('MINUTE', 0, CURRENT_DATE))), null),
       ('0f797d32-59fe-4943-8f72-2041ce57bbcd', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76',
        DATEADD('DAY', 1, DATEADD('HOUR', 10, DATEADD('MINUTE', 0, CURRENT_DATE))),
        DATEADD('DAY', 1, DATEADD('HOUR', 10, DATEADD('MINUTE', 30, CURRENT_DATE))), null),
       ('151d9da6-408e-4eb3-931c-51ec8c8a282a', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76',
        DATEADD('DAY', 1, DATEADD('HOUR', 10, DATEADD('MINUTE', 30, CURRENT_DATE))),
        DATEADD('DAY', 1, DATEADD('HOUR', 11, DATEADD('MINUTE', 0, CURRENT_DATE))),
        'aedf0f6d-20be-487d-9725-bf091ff2bf6a'),
       ('5f7e6100-0a28-4fbe-a5dc-faf507eb57a9', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76',
        DATEADD('DAY', 1, DATEADD('HOUR', 11, DATEADD('MINUTE', 0, CURRENT_DATE))),
        DATEADD('DAY', 1, DATEADD('HOUR', 11, DATEADD('MINUTE', 30, CURRENT_DATE))), null),
       ('a76852f4-075f-4b4d-820c-536292097a42', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76',
        DATEADD('DAY', 1, DATEADD('HOUR', 11, DATEADD('MINUTE', 30, CURRENT_DATE))),
        DATEADD('DAY', 1, DATEADD('HOUR', 12, DATEADD('MINUTE', 0, CURRENT_DATE))), null),
       ('49719ccb-33d5-4ff4-8989-5a5b2348022c', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76',
        DATEADD('DAY', 1, DATEADD('HOUR', 12, DATEADD('MINUTE', 0, CURRENT_DATE))),
        DATEADD('DAY', 1, DATEADD('HOUR', 12, DATEADD('MINUTE', 30, CURRENT_DATE))), null),
       ('1d0c0f27-5227-43ae-888f-6deb1c5d0163', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76',
        DATEADD('DAY', 1, DATEADD('HOUR', 12, DATEADD('MINUTE', 30, CURRENT_DATE))),
        DATEADD('DAY', 1, DATEADD('HOUR', 13, DATEADD('MINUTE', 0, CURRENT_DATE))), null),
       ('e2fc9c88-4135-43f6-bf72-656c4631f330', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76',
        DATEADD('DAY', 2, DATEADD('HOUR', 12, DATEADD('MINUTE', 0, CURRENT_DATE))),
        DATEADD('DAY', 2, DATEADD('HOUR', 12, DATEADD('MINUTE', 30, CURRENT_DATE))),
        '8b84920a-64ab-49ab-b661-4436f349a244'),
       ('a7cce145-a75b-47b8-b598-703db2cf4257', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76',
        DATEADD('DAY', 2, DATEADD('HOUR', 12, DATEADD('MINUTE', 30, CURRENT_DATE))),
        DATEADD('DAY', 2, DATEADD('HOUR', 14, DATEADD('MINUTE', 0, CURRENT_DATE))), null),
       ('714d7c6d-039e-4dfa-b11c-e7bc4bf337b0', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76',
        DATEADD('DAY', 2, DATEADD('HOUR', 13, DATEADD('MINUTE', 0, CURRENT_DATE))),
        DATEADD('DAY', 2, DATEADD('HOUR', 13, DATEADD('MINUTE', 30, CURRENT_DATE))), null),
       ('4081445b-7c52-418d-b4c3-2456f9c9b839', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76',
        DATEADD('DAY', 2, DATEADD('HOUR', 13, DATEADD('MINUTE', 30, CURRENT_DATE))),
        DATEADD('DAY', 2, DATEADD('HOUR', 14, DATEADD('MINUTE', 0, CURRENT_DATE))), null),
       ('484d1e71-ef96-4489-8a12-83aeea979530', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76',
        DATEADD('DAY', 2, DATEADD('HOUR', 14, DATEADD('MINUTE', 0, CURRENT_DATE))),
        DATEADD('DAY', 2, DATEADD('HOUR', 14, DATEADD('MINUTE', 30, CURRENT_DATE))),
        'b8b3d6a6-da48-4371-8307-f2790b2e1bdc'),
       ('7fbc7d62-87db-412b-a15a-138f9f2abee0', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76',
        DATEADD('DAY', 2, DATEADD('HOUR', 14, DATEADD('MINUTE', 30, CURRENT_DATE))),
        DATEADD('DAY', 2, DATEADD('HOUR', 15, DATEADD('MINUTE', 0, CURRENT_DATE))), null),
       ('9311a25f-2fa0-4211-9dc1-00ff4a6e6cb8', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76',
        DATEADD('DAY', 2, DATEADD('HOUR', 15, DATEADD('MINUTE', 0, CURRENT_DATE))),
        DATEADD('DAY', 2, DATEADD('HOUR', 15, DATEADD('MINUTE', 30, CURRENT_DATE))),
        '225453a0-03e2-4dc4-99b9-49d73daae199'),
       ('966e7bee-4361-41c8-9997-650f0531555d', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76',
        DATEADD('DAY', 2, DATEADD('HOUR', 15, DATEADD('MINUTE', 30, CURRENT_DATE))),
        DATEADD('DAY', 2, DATEADD('HOUR', 16, DATEADD('MINUTE', 0, CURRENT_DATE))), null),
       ('b8f09130-c5dc-4b0c-9433-9318d65f44c4', 'd0bcb328-c89d-4cf5-add9-61bab97124f8',
        'd0bcb328-c89d-4cf5-add9-61bab97124f8', '3d58a2ae-a2fa-44d6-bfa0-aa258bd18e76',
        DATEADD('DAY', 3, DATEADD('HOUR', 13, DATEADD('MINUTE', 0, CURRENT_DATE))),
        DATEADD('DAY', 3, DATEADD('HOUR', 13, DATEADD('MINUTE', 30, CURRENT_DATE))), null);
