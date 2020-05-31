package ContractJava;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.5.16.
 */
@SuppressWarnings("rawtypes")
public class Product_sol_Product extends Contract {
    public static final String BINARY = "60806040523480156100115760006000fd5b505b33600060006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505b61005a565b61055b806100696000396000f3fe60806040523480156100115760006000fd5b50600436106100515760003560e01c806355b72f38146100575780637fd8454b146100db578063ae7b6bd91461019e578063af14363f1461022257610051565b60006000fd5b61005f6102e5565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156100a05780820151818401525b602081019050610084565b50505050905090810190601f1680156100cd5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b61019c600480360360208110156100f25760006000fd5b81019080803590602001906401000000008111156101105760006000fd5b8201836020820111156101235760006000fd5b803590602001918460018302840111640100000000831117156101465760006000fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f8201169050808301925050505050505090909192909091929050505061038f565b005b6101a66103ad565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156101e75780820151818401525b6020810190506101cb565b50505050905090810190601f1680156102145780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b6102e3600480360360208110156102395760006000fd5b81019080803590602001906401000000008111156102575760006000fd5b82018360208201111561026a5760006000fd5b8035906020019184600183028401116401000000008311171561028d5760006000fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f82011690508083019250505050505050909091929090919290505050610457565b005b606060016000508054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156103805780601f1061035557610100808354040283529160200191610380565b820191906000526020600020905b81548152906001019060200180831161036357829003601f168201915b5050505050905061038c565b90565b80600260005090805190602001906103a8929190610475565b505b50565b606060026000508054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156104485780601f1061041d57610100808354040283529160200191610448565b820191906000526020600020905b81548152906001019060200180831161042b57829003601f168201915b50505050509050610454565b90565b8060016000509080519060200190610470929190610475565b505b50565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106104b657805160ff19168380011785556104e9565b828001600101855582156104e9579182015b828111156104e857825182600050909055916020019190600101906104c8565b5b5090506104f691906104fa565b5090565b6105229190610504565b8082111561051e5760008181506000905550600101610504565b5090565b9056fea2646970667358221220f45225395ae979f7017b087ce142af85d8513eae7317394d363528d1e9ca678e64736f6c63430006080033";

    public static final String FUNC_GETLATITUDE = "getLatitude";

    public static final String FUNC_GETLONGITUDE = "getLongitude";

    public static final String FUNC_SETLATITUDE = "setLatitude";

    public static final String FUNC_SETLONGITUDE = "setLongitude";

    @Deprecated
    protected Product_sol_Product(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Product_sol_Product(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Product_sol_Product(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Product_sol_Product(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<String> getLatitude() {
        final Function function = new Function(FUNC_GETLATITUDE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<String> getLongitude() {
        final Function function = new Function(FUNC_GETLONGITUDE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> setLatitude(String latMap) {
        final Function function = new Function(
                FUNC_SETLATITUDE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(latMap)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> setLongitude(String longMap) {
        final Function function = new Function(
                FUNC_SETLONGITUDE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(longMap)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static Product_sol_Product load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Product_sol_Product(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Product_sol_Product load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Product_sol_Product(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Product_sol_Product load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Product_sol_Product(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Product_sol_Product load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Product_sol_Product(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Product_sol_Product> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Product_sol_Product.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    public static RemoteCall<Product_sol_Product> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Product_sol_Product.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Product_sol_Product> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Product_sol_Product.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Product_sol_Product> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Product_sol_Product.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
