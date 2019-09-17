insert INTO WHIPROUND (id, goal, description) values (nextval('whip_seq'), 100, 'Sweter dla pana Dariusza');
insert INTO WHIPROUND (id, goal, description) values (nextval('whip_seq'), 40, 'Karma dla Dogdao');

insert INTO DONATION (id, whipround_id, amount, user_name, email) values (nextval('donate_seq'), 1, 1, 'Darek', 'dariusz.c@dogdao.com');
commit;