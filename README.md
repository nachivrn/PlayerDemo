## REST API

The service should expose two REST endpoints:
GET /api/players - returns the list of all players
GET /api/players/{playerID} - returns a single player by it's ID

## Additional Requirements:

### Rate Limiting

The service should expose an additional REST API endpoint:

POST /api/sleep - sleeps for the specified duration in seconds, then returns.
