# SRS

## Objective
Create a web application that works similar to Anki. First dataset will be one loaded with Jouyou kanji grade 1.

### Progress
- Connect application to PostgreSQL database.
-- database connection does not work with all fields
-- database only reads id, concept, meaning, mnemonic, and synonym 
- Setup API for CRUD operations on the card object.
- Setup interval progression system.
  - interval timings after every review will double(4 hr -> 8 hr -> 16 hr -> 32 hr) 
  - (extra) offer the user the ability to change interval timings