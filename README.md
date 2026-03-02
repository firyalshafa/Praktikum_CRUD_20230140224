# User API Specification

## Create User
Endpoint : POST /api/users

Request Body :

```json
{
  "nama" : "caca",
  "usia" : 22
}
```

Response Body (success) :

```json
{
  "data": {
    "id" : "random string",
    "nama": "caca",
    "usia": 22
  }
}
```

Response Body (failed) :

```json
{
  "error": "Invalid input data"
}
```

## Update User
Endpoint : PUT /api/users/{id}

Request Body :

```json
{
  "nama" : "caca",
  "usia" : 21
}
```

Response Body (success) :

```json
{
  "data": {
    "id" : "random string",
    "nama": "caca",
    "usia": 21
  }
}
```

Response Body (failed) :

```json
{
  "error": "User not found"
}
```

## Get User
Endpoint : GET /api/users

Response Body (success) :

```json
{
  "data": {
    "id" : "random string",
    "nama": "caca",
    "usia": 21
  }
"data": {
    "id" : "random string",
    "nama": "mark",
    "usia": 25
  }
}
```

Response Body (failed) :

```json
{
  "error": "User not found"
}
```

## Delete User
Endpoint : DELETE /api/users/{id}

Response Body (success) :

```json
{
  "message": "User deleted successfully"
}
```

Response Body (failed) :

```json
{
  "error": "User not found"
}
```

Screenshot

<img width="1909" height="981" alt="Screenshot 2026-03-02 115305" src="https://github.com/user-attachments/assets/0d59ec67-864e-4511-b7bf-c55c713d1424" />

<img width="1914" height="951" alt="Screenshot 2026-03-02 115328" src="https://github.com/user-attachments/assets/be1b009c-67fd-4eb8-84bb-478a828ca184" />

<img width="1919" height="969" alt="Screenshot 2026-03-02 115346" src="https://github.com/user-attachments/assets/89e55d01-b42f-4e68-9bb1-25608064acff" />

<img width="1919" height="977" alt="Screenshot 2026-03-02 115413" src="https://github.com/user-attachments/assets/69a447db-9d3a-415c-927b-0ab7541493a2" />

<img width="1919" height="909" alt="Screenshot 2026-03-02 115423" src="https://github.com/user-attachments/assets/bd49a91f-f559-45a5-9452-d6c76579189e" />





