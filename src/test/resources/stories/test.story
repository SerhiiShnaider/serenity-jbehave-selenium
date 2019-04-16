
Scenario: User searches for picture on Google
Given Accesses the google page
When When they type in <query>
Then We should see <rez>

Examples:
|query|rez|
|picture| picture|
|picture1| picture2|

Scenario: User open DuckDuckGo
Given Accesses the DuckDuckGo page
Then We should see DuckDuckGo in title