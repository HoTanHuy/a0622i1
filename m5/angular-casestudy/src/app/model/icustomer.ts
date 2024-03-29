import {ICustomerType} from './icustomer-type';

export interface ICustomer {
  id?: string;
  type?: ICustomerType;
  name?: string;
  birthday?: string;
  gender?: number;
  idCard?: string;
  phone?: string;
  email?: string;
  address?: string;
}
