/**
 * class Clinic
 * @author Electron
 *
 */
public class Clinic {
	
	private final Client []client;
	
	/*
	 * constructor which has client and clients has array of size
	 */
	
	
	/*
	 * counts number of clients
	 * @return count
	 */
	public int numberClients(){
		int count = 0;
		for (int i=0;i<this.client.length;i++){
			if(this.client[i]!=null){
				count++;
			}
		}
		return count;
	}
	
	/*
	 * add new client
	 * @param position
	 * @param client
	 */
	public void addClient(int position, Client client){
		this.client[position] = client;
	}
	
	/*
	 * search clients by pet name
	 * @param pet name
	 */
	public Client[] findClientsPetName(String petName){
		int numPets = 0;
		/*
		 * if client != null and cleint's pet !=null and client's pet name equal pet name
		 * count num of pets
		 */
	}
	
	/*
	 * search clients by pet id
	 * @param client id
	 */
	public Client[] findClientPetId(String id){
		/*
		 * if client != null and clients id equal id
		 * count num of client
		 */
	}
	
	public boolean removeClient(String id){
		/*
		 * boolean isRemove = false;
		 * if client!=null and clients id equal id
		 * isRemove = true
		 */
	}
	
	
	
}
