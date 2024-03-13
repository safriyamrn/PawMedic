import sqlalchemy
from sqlalchemy.ext.declarative import declarative_base

# Define the MariaDB engine using MariaDB Connector/Python

engine = sqlalchemy.create_engine("mariadb+mariadbconnector://app_user:Password123!@127.0.0.1:3306/company")

User : app_user
Password : 123
Host: 127.0.0.1 (localhost)
Port: 5432
Default database: company

Base = declarative_base()

class Employee(Base):
    __tablename__ = 'employees'
    id = sqlalchemy.Column(sqlalchemy.Integer, primary_key=True)
    first_name = sqlalchemy.Column(sqlalchemy.String(length=100))
    last_name = sqlalchemy.Column(sqlalchemy.String(length=100))
    active = sqlalchemy.Column(sqlalchemy.Boolean, default=True)

    Base.metadata.create_all(engine)

    Session = sqlalchemy.orm.sessionmaker()
Session.configure(bind=engine)
Session = Session()

newEmployee = Employee(firstname= 'Rob', lastname=”Hedgpeth”)
session.add(newEmployee)
session.commit()

employees = session.query(Employee).all()

employee = session.query(Employee).get(1)

employee = session.query(Employee).filter_on(firstname=”Rob”)
                                             
employee = session.query(Employee).get(1)

employee.firstname = “Robert”

session.commit()

session.query(Employee).filter(Employee.id == id).delete()

session.commit()

