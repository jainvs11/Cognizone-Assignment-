# Cognizone-Assignment-
Assignment for cognizone

Run as Java application: Main class: MessageClient.java

For creating message using post request <br/>
http://localhost:8080/createMessage<br/>
Add parameter as message=Message1<br/>

for feching all messages<br/>
http://localhost:8080/getAllMessages<br/>

for feching message with messageId<br/>
http://localhost:8080/getMessage?messageId=1<br/>
http://localhost:8080/getMessage?messageId=2<br/>

For Soft delete using delete method<br/>
http://localhost:8080/softDelete?messageId=1<br/>

For getEvenDeletedMessages<br/>
http://localhost:8080/getEvenDeletedMessages<br/>