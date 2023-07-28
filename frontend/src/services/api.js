import axios from "axios";


const username = 'ajay';
const password = '12345';
const authHeader = `Basic ${btoa(`${username}:${password}`)}`;

const headers = {
  'Authorization': authHeader,
  'Content-Type': 'application/json',
};

const URL = 'http://localhost:8081'
const URI2 = 'http://localhost:8080'

const userLogin = ()=> axios.get (`${URL}/get`,{headers})
const userRegister = (data) => axios.post(`${URL}/post`,data,{headers})

const addFeedback = (feedback) => axios.post(`${URI2}/feedback/add`, feedback)
export {userLogin,userRegister,addFeedback}