pragma solidity ^0.6.8;

contract Product {
    /* Define variable owner of the type address */
    address owner;
    string longitude;
    string latitude;

    /* This function is executed at initialization and sets the owner of the contract */
    constructor() public { owner = msg.sender; }

    function setLatitude (string memory latMap) public {
        latitude = latMap;
    }

    function getLatitude () public view returns (string memory) {
        return latitude;
    }

    function setLongitude (string memory longMap) public {
        longitude = longMap;
    }

    function getLongitude () public view returns (string memory) {
        return longitude;
    }
}
