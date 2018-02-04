Feature: As a user, I want to perform click operations on Domain website

  Scenario Outline: Click different tabs on Domain Home page
    Given I am on Domain home page
    When I click on the tab <tabName>
    Then the target tab-page <tabName> and section title <sectionTitle> and <pageTitle> is displayed successfully

    Examples:
      | tabName       | sectionTitle                                 | pageTitle                                                           |
      | Rent          | Find your perfect home                       | Rent Houses, Apartments, Units, Flats and New Developments          |
      | Buy           | Find your perfect home                       | Real Estate \| Properties for Sale, Rent and Share                  |
      | Sold          | Find your perfect home                       | Sold Houses, Apartments, Units, Flats and New Developments          |
      | New Homes     | Find New Homes                               | New Homes \| Home & Land Packages \| Off the Plan Apartments        |
      | Agents        | Find your local Real Estate Agent            | Search for real estate agents to sell your property in Australia    |
      | Commercial    | Australia's leading commercial property site | Commercial Real Estate and Property For Sale and Lease in Australia |
      | News > Advice | Real Estate Tips & Advice                    | Real Estate Tips, Guides & Advice                                   |
      | News > Living | Home Trends & Inspiration                    | Home Trends & Inspiration                                           |