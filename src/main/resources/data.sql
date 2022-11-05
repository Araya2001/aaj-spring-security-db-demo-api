-- WAREHOUSES
INSERT INTO public.warehouse (id, date_created, date_updated, name, region) VALUES (1, '2022-11-05 11:44:00.000000', '2022-11-05 11:44:00.000000', 'WAREHOUSE 1', 'CR-CAR');
INSERT INTO public.warehouse (id, date_created, date_updated, name, region) VALUES (2, '2022-11-05 11:44:00.000000', '2022-11-05 11:44:00.000000', 'WAREHOUSE 2', 'CR-CAR');
INSERT INTO public.warehouse (id, date_created, date_updated, name, region) VALUES (3, '2022-11-05 11:44:00.000000', '2022-11-05 11:44:00.000000', 'WAREHOUSE 3', 'CR-SJO');
INSERT INTO public.warehouse (id, date_created, date_updated, name, region) VALUES (4, '2022-11-05 11:44:00.000000', '2022-11-05 11:44:00.000000', 'WAREHOUSE 4', 'CR-SJO');

-- PRODUCTS
INSERT INTO public.product (id, date_created, date_updated, description, name, warehouse_id) VALUES (1, '2022-11-05 11:44:00.000000', '2022-11-05 11:44:00.000000', 'PAPAS FRITAS', 'PRINGLES', 1);
INSERT INTO public.product (id, date_created, date_updated, description, name, warehouse_id) VALUES (2, '2022-11-05 11:44:00.000000', '2022-11-05 11:44:00.000000', 'COMPUTADORA NEGRA', 'DELL', 1);
INSERT INTO public.product (id, date_created, date_updated, description, name, warehouse_id) VALUES (3, '2022-11-05 11:44:00.000000', '2022-11-05 11:44:00.000000', 'TABLET ROJA', 'SAMSUNG', 2);
INSERT INTO public.product (id, date_created, date_updated, description, name, warehouse_id) VALUES (4, '2022-11-05 11:44:00.000000', '2022-11-05 11:44:00.000000', 'TELÉFONO NEGRO', 'APPLE', 2);
INSERT INTO public.product (id, date_created, date_updated, description, name, warehouse_id) VALUES (5, '2022-11-05 11:44:00.000000', '2022-11-05 11:44:00.000000', 'RELOJ AZUL', 'CASIO', 3);
INSERT INTO public.product (id, date_created, date_updated, description, name, warehouse_id) VALUES (6, '2022-11-05 11:44:00.000000', '2022-11-05 11:44:00.000000', 'REFRIGERADOR GRIS', 'SAMSUNG', 3);
INSERT INTO public.product (id, date_created, date_updated, description, name, warehouse_id) VALUES (7, '2022-11-05 11:44:00.000000', '2022-11-05 11:44:00.000000', 'ZAPATOS CAFÉ', 'NIKE', 4);
INSERT INTO public.product (id, date_created, date_updated, description, name, warehouse_id) VALUES (8, '2022-11-05 11:44:00.000000', '2022-11-05 11:44:00.000000', 'MONITOR 32in 4k', 'SAMSUNG', 4);
