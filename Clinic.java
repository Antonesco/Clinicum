/**
 * class Clinic
 * @author Electron
 *
 */
public class Clinic {
	
	private final Client []client;
	
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
	public Client[] searchClientsPetName(String petName){
		
	}
	
	/*
	 * search clients by pet id
	 * @param client id
	 */
	public Client[] searchClientPetId(String id){
		
	}
	
	public boolean removeClient(String id){
		
	}
	
	
	
}
