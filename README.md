# simple client-server application

sends some data from client to the server, where the computation is done and the
result is sent back to the client.

This type of applications is commonly used in Distributed Systems.

## Details

1. A client program called _Client.java_ and a server program called _Server.java_
2. The _server program_ continuously check if there are any client requests, and
handles them.
3. The client program’s main method takes two arguments 
_(destination server IP/hostname and destination server port)_ and these arguments
must are not statically wired in the program itself. The client’s program uses those
arguments later to connect to the server.
4. User inputs integers (one at a time) dynamically (not stored in the program),
and the _client program_ checks the input (whether it is an integer or not).
5. The _client program_ sends Integers to the server (one integer at a time),
the _server program_ then gets the square of that number and sends the result back
to the client.

## Notes

This Program made based on the first assignment in the Distributed Systems course at college.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
