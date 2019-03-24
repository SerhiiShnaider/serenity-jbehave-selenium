
Scenario: User searches for picture on Google
Given the user accesses the google landing page
When when they type in <query>
Then we should see <rez>

Examples:
|query|rez|
|picture| picture|
|picture1| picture2|