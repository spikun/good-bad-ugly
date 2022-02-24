## SCENARIO

Developer is defining model for a person.

### Wrongs and why
#### age: string
Harder to compare different ages, will be wrong after a person ages

#### socialSecurityNumber: number
SSN tend to be quite long, not fitting into many number type maximums. Comparison between SSN number has no meaning. Will never perform arithmetics.

#### phoneNumber: number
Harder to store foreign numbers. Will never perform arithmetics.

### UI
UI wise could show SSN and phone number with + and - to enter :D
