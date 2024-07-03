package 인터페이스.문제2;

public interface IWorkingTogether {
  int workTogether(IWorkingTogether partner);

  default String partnerName(IWorkingTogether partner){
    return ((Factory)partner).getFactoryName();
  }
}
